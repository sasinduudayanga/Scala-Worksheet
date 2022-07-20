//Question 2
var k,i,j =2
var m,n=5
var f=12.0
var g=4.0
var c="X"

//Question 3
k+12*m
m/j
n%j
m/j*j
f+10*5+g

//
var a=2
var b=3
var c=4
var d=5
var k=4.3

b=b-1
println(b*a + c*d)
d=d-1

println(a)
a=a+1

println(-2*(g-k)+c)

println(c)
c=c+1

c=c+1
println(c*a)
a=a+1


//Question 4 (a)
def normalWH(wHours:Int):Double= 250 * wHours
def otH(otHours:Int):Double= 85 * otHours
def income(h1:Int,h2:Int):Double= normalWH(h1) + otH(h2)
def tax(totIncome:Double):Double= totIncome * 0.12
def takeHome(h1:Int,h2:Int):Double= income(h1,h2) - tax(income(h1,h2))

takeHome(40,30)

//Question 4 (b)
def attendees(Tprice:Int):Int= 120+(15-Tprice)/5 *20
def revenue(Tprice:Int):Int= Tprice * attendees(Tprice)
def cost(Tprice:Int):Int= 500+ 3*attendees(Tprice)
def profit(Tprice:Int):Int= revenue(Tprice)-cost(Tprice)

print(profit(5),profit(10),profit(15),profit(20),profit(25),profit(30),profit(35),profit(40))
//can get maximum profit at ticket price is Rs.25/=
