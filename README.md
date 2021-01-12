# Hello Weather API
- Spring Boot API to save and retrieve the Weather data object.
- Handled the HTTP responses.
- Handled custom hello requests.


## Environment:
- Java version: 1.8
- Maven version: 3.*
- Spring Boot version: 2.2.1.RELEASE

## Data:
Sample example of JSON data object:
```json
{
   "id": 1,
   "date": "1985-01-01",
   "firstName": "Foo",
   "lastName": "Bar",
   "phoneNumber": 3876542098
}
```

## Requirements:
The `REST` service must expose the `/endpoint` endpoint, which allows for managing the data records in the following way:


`POST` request to `/insert` :
* creates a new weather data record
* the response code is 201 and the response body is the created record, including its unique id


`GET` request to `/select`:
* the response code is 200
* the response body is an array of matching records, ordered by their ids in increasing order


`GET` request to `/select/<id>`:
* returns a record with the given id and status code 200
* if there is no record in the database with the given id, the response code is 404


`DELETE` request to `/delete/<id>`:
* deletes the record with the given id from the database and return status code 200
* if there was no record in the database with the given id, the response code is 404


 - The project by default supports the use of the H2 database.

## Commands
- run: 
```bash
mvn clean package; java -jar target/project_jar-1.0.jar
```
- install: 
```bash
mvn clean install
```
- test: 
```bash
mvn clean test
```
