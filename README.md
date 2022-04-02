# react-servlet-technical-demo

Technical Proof of Concept that React and Servlet can pass around data with HTTP JSON API

## API Scheme

```
GET /java-backend/lookupwithlastname?lastName=Cho
```

- Returns if User data if User if found with ;ast name.

```
GET /java-backend/userexists?firstname=Sunghyun&lastname=Cho
```

- Returns if User data if User exists.

## JSON Scheme

```
{
  "isOk": true,
  "User": {
    "firstname": "Sunghyun",
    "lastname": "Cho"
  }
}
```

## Example

```http
GET /java-backend/userexists?firstname=Sunghyun&lastname=Cho
```

Returns

```json
{
  "isOk": true,
  "User": {
    "firstname": "Sunghyun",
    "lastname": "Cho"
  }
}
```

```http
GET /java-backend/userexists?firstname=Richard&lastname=Hendricks
```

Retruns

```json
{
  "isOk": false
}
```
