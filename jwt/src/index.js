require('dotenv/config');
const express = require('express');
const cookieParser = require('cookie-parser');
const cors = require('cors');
const {hash, compare} = require('bcryptjs');
const {verify} = require("jsonwebtoken")


// Register a user
// Login a user
//  Logout user
// protected route
// get new access token from refresh token 


const server = express();

server.use(cookieParser());

server.use(
    cors({
        origin: 'http://localhost:5000',
        credentials: true
    })
);


server.use(express.json())
server.use(express.urlencoded({extended:true}))


server.listen(process.env.PORT,()=>
    console.log(`Server listening on port no : ${process.env.PORT}`),
)

server.post('/register', async (req, res) => {
    const { email, password } = req.body;

    if (!email || !password) {
        return res.status(400).json({ message: "Email and password required" });
    }

    try {
        const hashedPassword = await hash(password, 10);

        console.log("EMAIL:", email);
        console.log("HASH:", hashedPassword);

        return res.status(201).json({
            message: "User registered successfully",
            email
        });
    } catch (error) {
        return res.status(500).json({
            message: "Something went wrong",
            error: error.message
        });
    }
});

