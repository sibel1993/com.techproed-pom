<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="Suite1" verbose="1" >
<test name="Positive Login Test" >
<classes>
<class name="com.techproed.smoketest.Day11_PositiveTest" />
<class name="com.techproed.tests.Day10_TestAddressLoginTest" />
</classes>
</test>
<test name="Negative Login Test">
<classes>
<class name="com.techproed.smoketest.Day11_NegativeTest"/>
</classes>
</test>
</suite>