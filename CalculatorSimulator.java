package basic;
class CountryNotValidException extends Exception
{
CountryNotValidException(String msg)
{
super(msg);
}
}

class EmployeeNameInvalidException extends Exception
{
EmployeeNameInvalidException(String msg)
{
super(msg);
}
}

class TaxNotEligibleException extends Exception
{
TaxNotEligibleException(String msg)
{
super(msg);
}
}
class TaxCalculator
{
double calculateTax(String empname,boolean isindian,double empsal)throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException     
{
if(!isindian)
{
throw new CountryNotValidException("the employee should be an Indian citizen for calculating tax");
}
if(empname==null||empname.isEmpty())
{
throw new EmployeeNameInvalidException("the employee name cannot be empty");
}
if(empsal>100000 && isindian==true)
{
return empsal*8/100;
}
else if(empsal>=50000 && empsal<=100000 && isindian==true)
{
return empsal*6/100;
}
else if(empsal>=30000 && empsal<=50000 && isindian==true)
{
return empsal*5/100;
}
else if(empsal>=10000 && empsal<=30000 && isindian==true)
{
return empsal*4/100;
}
else 
{
throw new TaxNotEligibleException("the employee does not need to pay tax");
}
}
}

public class CalculatorSimulator{

	public static void main(String[] args) {
		TaxCalculator t=new TaxCalculator();
		try{
		double tax=t.calculateTax("",true,30000);
		System.out.println("Tax amount:"+tax);
		} 
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}

	}

}
