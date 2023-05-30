# API First Application Sample
## Example of YAML and process of source code generation from YAML.
Generate Spring Boot server using OPENAPI-GENERATOR 
    
1. Donwload the OPEN API extention in VS code

![image](https://github.com/rohaniictemp/apiFirstExample/assets/34153168/423245de-e2c3-46fa-9630-137e24af2aca)

2. Create and define end points using the OpenAPI extentions. Click the option button in path to add paths. Define the method , Desc , Response accordingly.

![image](https://github.com/rohaniictemp/apiFirstExample/assets/34153168/0e0ffa03-43b2-4667-ab8c-38a2e3af92d3)

3. Verify the end point using the button on the top right corner

![image](https://github.com/rohaniictemp/apiFirstExample/assets/34153168/1d620590-5089-4f03-92fc-f492c32e0b09)

4. Open terminal and go to the directory of the YAML file.
5. Download the open-api generator using NPM 
```sh
npm install @openapitools/openapi-generator-cli -g
```
	
6. generate the spring project using the command 

```sh
openapi-generator-cli generate -i test.yaml -g ruby -o /tmp/test/"
```
7. Spring boot project will be created at path /tmp/test (change it accordingly in above command) 
8. Run the SpringBoot server and open the swagger UI with the URL 
```sh
http://localhost:8080/swagger-ui/index.html?
```




