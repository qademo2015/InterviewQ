<?php
//factorial
function factorial($a)
{
	if ($a == 1)
		return 1;
	else
		return $a*factorial($a-1);
}


//the sum of digits of a number
function sumOfDigits($num)
{
	if ($num > 10)
		return $num%10 + sumOfDigits(floor($num/10));
	else
		return $num;
}

//convert a number from Decimal to Binary
function decToBin($num)
{
	if ($num > 1)
		return pow(10, floor(log($num,2))) + decToBin($num - pow(2, floor(log($num,2))));
	else
		return $num;
}


//Power of a number
function power($num, $exp)
{
	if ($exp == 0)
		return 1;
	else
		return $num * power($num, $exp - 1);
}


function fibonacci($n)
{
	if ($n == 0) return 0;
	if ($n == 1) return 1;
	if ($n > 0)
	return fibonacci($n-1) + fibonacci($n-2);
}

?>