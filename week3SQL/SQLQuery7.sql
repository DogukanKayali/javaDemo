select ProductName as Name, ProductID as ID from Products

select p.ProductName, p.UnitsInStock * p.UnitPrice as Total from Products as p

select p.ProductName + ' - ' + p.QuantityPerUnit from Products p

select * from Products where CategoryID = 1

select * from Products where UnitsInStock < 10 and UnitsOnOrder > 0

select * from Products where not ProductName='Chai' and UnitsInStock=0

select * from Products order by UnitPrice desc

select * from Products order by UnitPrice, ProductName desc

select * from Products where ProductName like '%Ch%'

select * from Products where UnitPrice between 10 and 50 order by UnitPrice

select * from Products where SupplierID in (1,2)

select Count(*) [�r�n Say�s�] from Products

select Count(ProductName) from Products

select count(Region) from Customers

select min(UnitPrice) from Products
select max(unitprice) from Products

select avg(UnitPrice) from products
select sum(UnitPrice * Quantity) as Kazanc from [Order Details]

select rand()

select left('Do�ukan Kayal�', 3)
select left(ProductName,3) from Products

select right(ProductName,3) from Products

select len('Do�ukan Kayal�')
select productName, len(ProductName) as Karakter from Products

select LOWER('Do�uKaN KaYaL�')
select upper('Do�uKaN KaYaL�')

select trim('  do�ukan kayal�  ')  --lteim , rtrim 
select * from Products where Trim(ProductName) = 'chai'

select * from Products where len(productname) > 10

select reverse('Do�ukan Kayal�')

select CHARINDEX('n','Do�ukan kayal�',1)
select CHARINDEX('a',ProductName,1) from Products 

select ProductName from Products where CHARINDEX('anton',ProductName,1)>0

select REPLACE('do�ukan kayal�',' ','_')

select replace(productName, ' ','_') from Products 

select SUBSTRING('Do�ukan Kayal�',4,7)

select ascii('a')

select char(65)

select distinct(country) from customers 
select distinct country, City from customers

select Country,Count(*) as Adet from Customers group by Country
select Country,City,Count(*) as Adet from Customers group by Country,City order by Country

select Country,City,Count(*) as Adet from Customers group by Country,City having Count(*)>1 order by Country

select Country,City,Count(*) as Adet from Customers where City != 'Nantes' 
group by Country,City having Count(*)>1 order by Country

select * from Products inner join Categories on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>20 order by Categories.CategoryID

select * from Products p inner join Categories c on P.CategoryID = C.CategoryID
where P.UnitPrice>20 order by C.CategoryID

select * from Products as p inner join [Order Details] as od on p.ProductID = od.ProductID inner join Orders as o 
on o.OrderID = od.OrderID

select p.ProductName, o.OrderDate, od.Quantity * od.UnitPrice as Total from Products as p inner join [Order Details] as od on p.ProductID = od.ProductID inner join Orders as o 
on o.OrderID = od.OrderID order by p.ProductName, o.OrderDate

select * from Products p left join [Order Details] od on p.ProductID = od.ProductID where od.ProductID is null

select * from Customers c left join Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null

select * from Customers c full join Orders o on o.CustomerID = c.CustomerID

select * from Employees e left join Orders o on o.EmployeeID = e.EmployeeID where o.EmployeeID is null

select p.ProductName,count(*) as Adet from Products as p inner join [Order Details] as od on p.ProductID = od.ProductID
where od.Discount>0 group by p.ProductName

select c.CategoryName,count(*) as Adet from Products p inner join [Order Details] od on p.ProductID = od.ProductID inner join Categories c on
c.CategoryID = p.CategoryID group by c.CategoryName

-- kime rapor veriyor
select e2.FirstName + ' ' + e2.LastName as Personel , e.FirstName+' '+ e.LastName as [Reports To] 
from Employees as e right join Employees e2 on e.EmployeeID = e2.ReportsTo

-- ---- kay�t ekleme
insert into Categories (CategoryName, Description) values ('Test Category', 'Test Category Description')

-- basl�k verilmezse butun degerler g�r�lmel�
insert into [Order Details] values (10248, 12, 12, 10, 0)

-- g�ncelleme
update Categories set CategoryName = 'Test C 2', Description = 'Test Cat 2' where CategoryID = 9

-- silme
delete from Categories where CategoryID = 9

select * from CustomersWork 

insert into CustomersWork (CustomerID, CompanyName, ContactName) select CustomerID, CompanyName, ContactName
from Customers where ContactName like '%en%'

delete from CustomersWork

UPDATE Customers set CompanyName = CustomersWork.CompanyName from Customers inner join CustomersWork on 
Customers.CustomerID = CustomersWork.CustomerID where CustomersWork.CompanyName like '%TEST%'

select * from Customers

delete Customers from Customers inner join CustomersWork on 
Customers.CustomerID = CustomersWork.CustomerID where CustomersWork.CompanyName like '%TEST%'

-- union fakl�l�klar� ekler, union all hepsini bir araya getirir
select CustomerID, CompanyName, ContactName from CustomersWork 
union
select CustomerID, CompanyName, ContactName from Customers
