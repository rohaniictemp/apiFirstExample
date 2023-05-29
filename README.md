		Generate Spring Boot server using OPENAPI-GENERATOR 
    <-- Download SOP -->
    
# donwload the OPEN API extention in VS code 
2. Create and define end points using the OpenAPI extentions. Click the option button in path to add paths. Define the method , Desc , Response accordingly.
3. Verify the end point using the button on the top right corner
4. Open Terminal and go to the directory of the yaml file.
5.  Download the open-api generator using NPM 
	" npm install @openapitools/openapi-generator-cli -g "
6. generate the spring project using the command 
	"openapi-generator-cli generate -i test.yaml -g ruby -o /tmp/test/"
7. Spring boot project will be created at path /tmp/test (change it accordingly in above command) 
8. Run the SpringBoot server and open the swagger UI with the URL 
	" http://localhost:8080/swagger-ui/index.html? "




