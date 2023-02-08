# singup

http://localhost:8080/api/auth/signup

`{
"username":
"email":
"password":
}`
# singup

http://localhost:8080/api/auth/signin

`{
"username":
"password":
}
`
# get all users 

http://localhost:8080/api/auth/get/all/users

# get user by name 

http://localhost:8080/api/auth/get/user?name={username}

# Edit user name and User Role

http://localhost:8080/api/auth/{userId}

```{
"username": "kavithaaaa",
"roles": [
{ "ref": "roles", "id": "{roleID}" }

]
}```


