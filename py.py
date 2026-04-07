#!/usr/bin/env python3
import socket
import re

def lcg_backward(x, a=1103515245, c=12345, m=2147483648):
    diff = (x - c) % m
    inv_a = pow(a, -1, m)
    return (diff * inv_a) % m

def solve_challenge():
    s = socket.socket()
    s.connect(('0.cloud.chals.io', 22078))
    data = s.recv(2048).decode()
    s.close()
    
    # Parse leaks and cipher
    leak_match = re.search(r'leak: \[(.*?)\]', data)
    cipher_match = re.search(r'cipher: ([0-9a-fA-F]+)', data)
    
    leaks = eval(f'[{leak_match.group(1)}]')
    cipher_hex = cipher_match.group(1)
    cipher_bytes = bytes.fromhex(cipher_hex)
    
    print(f"Leaks: {leaks}")
    print(f"Cipher: {cipher_hex}")
    
    # Find state BEFORE first leak
    x = lcg_backward(leaks[0])
    
    # Generate 20-byte keystream
    ks = []
    for _ in range(20):
        ks.append(x & 0xFF)
        x = (1103515245 * x + 12345) % 2147483648
    
    # Decrypt
    password_bytes = bytes(cb ^ (255 - k) for cb, k in zip(cipher_bytes, ks))
    password_hex = password_bytes.hex().upper()
    
    print(f"Password: {password_hex}")
    return password_hex

# Auto-submit
while True:
    try:
        password = solve_challenge()
        print(f"Submitting: {password}")
        
        s = socket.socket()
        s.connect(('0.cloud.chals.io', 22078))
        data = s.recv(1024).decode()
        s.send(f"{password}\n".encode())
        response = s.recv(1024).decode()
        s.close()
        
        print(f"Response: {response}")
        if "hudhack{" in response:
            print(f"FLAG: {response}")
            break
        elif "incorrect" in response.lower():
            print("Wrong, trying again...")
            continue
    except Exception as e:
        print(f"Error: {e}")
        continue

print("Done!")
