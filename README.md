# API First Application Sample
## Example of YAML and process of source code generation from YAML.
Generate Spring Boot server using OPENAPI-GENERATOR 
    
1. Donwload the OPEN API extention in VS code

![image](https://github.com/rohaniictemp/apiFirstExample/assets/34153168/423245de-e2c3-46fa-9630-137e24af2aca)

2. Create and define end points using the OpenAPI extentions. Click the option button in path to add paths. Define the method , Desc , Response accordingly.

![image](https://github.com/rohaniictemp/apiFirstExample/assets/116400291/5eb6f833-9784-4558-9622-3ef1b555d832)

	Once the paths are created define the end point briefly 
![image](https://github.com/rohaniictemp/apiFirstExample/assets/116400291/630d7823-a3d0-4441-bdd5-f7c90840a355)

![image](https://github.com/rohaniictemp/apiFirstExample/assets/116400291/fa30cae7-bef5-45fc-9d35-cf443edd3891)

![image](https://github.com/rohaniictemp/apiFirstExample/assets/116400291/b2919a2f-8c8b-4697-b4e4-5ba266e638f1)

Example : Under the /user path we have defined two methos GET and POST
>-	POST  > RESPONSE > 201: User Created||Request Body : Application JSON of user Schema to add an user
>-	GET > RESPONSES > 200 : give all the ursers in json format
>-	PUT > RESPONSE > 200 : Success Operation || Required Body : Application JSON ( USER DATA )
>-	DELETE > RESPONSE > 204 : Success Opertaion || Required Param : userID

3.  Add the Security Parameter if requried

	![image](https://github.com/rohaniictemp/apiFirstExample/assets/116400291/f59fd6a9-f10b-40de-bfbf-206f200a2ee3)
	
	to add security to all the paths define the securty tag above the "path" parameter 	
	![image](https://github.com/rohaniictemp/apiFirstExample/assets/116400291/5199549d-795e-4713-aaf6-0665ad419256)
	
	to add securty to a specific method/path define the security paramter inside the method body
	![image](https://github.com/rohaniictemp/apiFirstExample/assets/116400291/1359cbfe-7496-4240-adb4-e268189de61f)

4. Verify the end point using the button on the top right corner
	
	![image](https://github.com/rohaniictemp/apiFirstExample/assets/116400291/f39572bc-9e8d-49cd-b7a2-f0373551abd6)
	
	![image](https://github.com/rohaniictemp/apiFirstExample/assets/116400291/b89cf8d1-3d9a-4155-9b19-774cef77d62e)
	
	![image](https://github.com/rohaniictemp/apiFirstExample/assets/116400291/5b258e74-1609-4f86-a26f-b7d7ae467867)


5. Open terminal and go to the directory of the YAML file.
6. Download the open-api generator using NPM 
```sh
npm install @openapitools/openapi-generator-cli -g
```
	
7. generate the spring project using the command 

```sh
openapi-generator-cli generate -i test.yaml -g spring -o /tmp/test/"
```
8. Spring boot project will be created at path /tmp/test (change it accordingly in above command) 
9. Run the SpringBoot server and open the swagger UI with the URL 
```sh
http://localhost:8080/swagger-ui/index.html?
```




