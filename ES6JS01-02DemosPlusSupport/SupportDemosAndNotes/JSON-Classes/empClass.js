<html>
<script>
function display()
{
document.writeln("Employee Details are....");
document.writeln("Employee Id :"+this.empId+"</br>");
document.writeln("Employee Name :"+this.empName+"</br>");
document.writeln("Employee Address :"+this.empAddress+"</br>");
document.writeln("Employee Phone:"+this.empPhone+"</br>");
document.writeln("------------------------------------------</br>");
}
function Employee(eId,eName,eAddress,ePhone)
{
this.empId = eId;
this.empName = eName;
this.empAddress = eAddress;
this.empPhone = ePhone;
this.disp = display;
}
var emp1 = new Employee('E001','Harsha','RTNagar','8819199913');
var emp2 = new Employee('E002','Suman','JJNagar','8299299222');
var emp3 = new Employee('E003','Keerthana','KRNagar','8297588222');
var emp4 = new Employee('E004','Mahesh','RSNagar','8299267322');
emp1.disp();
emp2.disp();
emp3.disp();
emp4.disp();
</script>
</html>