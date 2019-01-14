const http = require('http')
const fs = require('fs')

http.createServer(function (request, response) {
  console.log('request come', request.url)

  const host=request.headers.host
  if (request.url === '/') {
    const html = fs.readFileSync('test.html', 'utf8')
    if(host==='test.com'){
    response.writeHead(200, {
      'Content-Type': 'text/html',  //domain=test.com   这个域才能访问到cookie
      'Set-Cookie': ['id=123; max-age=200', 'abc=456;domain=test.com'] //httponly 禁止cookie访问
    })
  }
    response.end(html)
  }

}).listen(8888)

console.log('server listening on 8888')