const express = require("express");
const app = express();

app.use(express.json());

app.get("/", (req, res) => {
  res.send("Backend is running 🚀");
});

app.get("/search", (req, res) => {
    res.json({
        query:req.query
    })
  res.send("Home page is running 🚀");
  console.log(req.body)
});



app.get("/user/:id",(req,res)=>{
    res.json({
        userId:req.params.id
    })
})


app.post("/login",(req,res) =>{
    res.json({
        body:req.body
    })
})






app.listen(5000, () => {
  console.log("Server running on port 5000");
});
