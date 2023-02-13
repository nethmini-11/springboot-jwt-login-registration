# springboot-jwt-login-registration

# POST APIs

## http://localhost:8080/api/auth/signin


{

    "username": ,
    
    "password":
    
}

## http://localhost:8080/api/auth/superadmin/signup    >> special signup for superadmin

{

    "username":,
    
    "email":,
    
    "orgname":null,
    
    "password":
}


## http://localhost:8080/api/auth/superadmin/signin   >> special signin for superadmin

{

    "username": ,
    
    "password":
}

## http://localhost:8080/api/auth/signup

{

    "username":,
    
    "email":,
    
    "orgname":,
    
    "password":
}

## http://localhost:8080/api/org/create

{

    "orgname":
}

# GET APIs

## http://localhost:8080/api/auth/get/all/users      

## http://localhost:8080/api/auth/get/user?name=

## http://localhost:8080/api/org/get/all/organizations

## http://localhost:8080/api/org/get/organization?name=

# PUT APIs

## http://localhost:8080/api/auth/role/{id}

{

    "username": ,
    
    "roles": [
    
        { "ref": "roles", "id": "enter role id " } 
        
       
    ]
    
}

## http://localhost:8080/api/org/update/{id}

{

    "orgname":
}
