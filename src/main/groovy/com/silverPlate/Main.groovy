package com.silverPlate

class Main {

	static void main(String[] args) {

		try {
//            String price = "1500.0"
//            println 'String.valueOf(price): ' + String.valueOf(price)
//            Double d = new Double(price)
//            println 'd[' + d +'] d.toString()[' + d.toInteger().toString() +']'
//            println 'price is : ' + Integer.parseInt(d.toInteger().toString())
//
//            String price2 = "7542.65"
//            println 'String.valueOf(price): ' + String.valueOf(price2)
//            Double d2 = new Double(price2)
//            println 'd2[' + d2 +'] d2.toString()[' + d2.toInteger().toString() +']'
//            println 'price is : ' + Integer.parseInt(d2.toInteger().toString())

//            println ''
//            String a = 'Close paid'
//            println a
//            println 'a.toLowerCase().contains(\'close\'): ' + a.toLowerCase().contains('close')
//
//            println ''
//            def number = "320000"
//            println 'Number Class: '+ number.class
//            println 'Integer.parseInt: ' + Integer.parseInt(number)
//            println 'Double.parseDouble: ' + Double.parseDouble(number)
//            println 'Float.valueOf: ' + Float.valueOf(number)
//            println 'Float.valueOf.toInteger: ' + Float.valueOf(number).toInteger()
//
//            println ''
//            def number2 = "320000.00"
//            println 'Number2 Class: '+ number2.class
//            println 'String.valueOf: ' + String.valueOf(number2)
//            println 'String.valueOf: ' + String.valueOf(number2).class
//            println 'Float.valueOf: ' + Float.valueOf(number2)
//            println 'Float.valueOf.toInteger: ' + Float.valueOf(number2).toInteger()
//            println 'Float.valueOf.toDouble: ' + Float.valueOf(number2).toDouble()
//
//
//            println ''
//            def number3 = "320000.60"
//            println 'Number3 Class: '+ number3.class
//            println 'String.valueOf: ' + String.valueOf(number3)
//            println 'Float.valueOf: ' + Float.valueOf(number3)
//            println 'Float.valueOf.toInteger: ' + Float.valueOf(number3).toInteger()
//            println 'Float.valueOf.toInteger: ' + Float.valueOf(number3).toInteger().class
//            println 'Float.valueOf.toBigDecimal: ' + Float.valueOf(number3).toBigDecimal()
//            println 'Float.valueOf.toBigDecimal: ' + Float.valueOf(number3).toBigDecimal().class
//            println 'Float.valueOf.toDouble: ' + Float.valueOf(number3).toDouble()
//            println 'Float.valueOf.toDouble: ' + Float.valueOf(number3).toDouble().class


//            def a = ErrorType.TIMEOUT
//            def b = ErrorType.TIMEOUT
//            def c = ErrorType.JSONPARSER
//
//            println 'a == b: '+ a.equals(b)
//            println 'a == ErrorType.TIMEOUT: '+ a.equals(ErrorType.TIMEOUT)
//            println 'b == c: '+ b.equals(c)
//            println 'a == c: '+ a.equals(c)

//            println OccupationUtil.translateToMyAccount("Accountant / Cashier")
//            OccupationUtil.test()

			def message = "ABC Test -#*Test"
			println URLEncoder.encode(message)

		} catch(Exception e) {
			println 'Exception: ' + e.getMessage()
		}

	}
}
