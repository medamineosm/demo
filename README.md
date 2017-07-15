# demo

# # Register User

curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{
  "email": "amine@gamil.com",
  "famillyName": "ousamine",
  "name": "amine",
  "password": "stringstring",
  "rePassword": "stringstring"
}' 'http://localhost:8080/registerUser'

# # Or you can use The Swagger Interface to run Controller Test
http://localhost:8080/swagger-ui.html
