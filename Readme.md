Usage Steps - Using H2 DB

Create the category
http://localhost:8080/categories/
{
    "id": 1,
    "name": "cat2"
}
Create the product
http://localhost:8080/products/
{
	"name":"pro1",
	"catId":1
}

Create the attibute
http://localhost:8080/attributes/
{
	"name":"color",
	"value":"red",
	"entityId":1,
	"entityName":"Category"
}

End Points
http://localhost:8080/categories/

http://localhost:8080/products/

http://localhost:8080/attributes/
http://localhost:8080/categories/1/attributes
