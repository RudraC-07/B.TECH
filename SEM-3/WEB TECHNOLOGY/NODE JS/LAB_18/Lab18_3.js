const http = require("http");
const fs = require("fs");

const server = http.createServer((req,res)=>{
    console.log(req.url);
    if(req.url==="/about"){
        let data = fs.readFileSync("./about.txt");
        //console.log(data);
        res.end(data);
    }
    else if(req.url==="/contact"){
        let data = fs.readFileSync("./contact.txt");
        //console.log(data);
        res.end(data.toString());
    }
});

const port = 3000;

server.listen(port,
    () => {
        console.log(
            `Server running at http://localhost:${port}/`
        );
    });