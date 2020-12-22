#!/bin/bash
for((i=0;i<11;i++))
do
	a[i]=$((RANDOM%100))
done
echo ${a[@]}
n=${#a[@]}
x=$((n/2))
y=$((n-1))
for((i=0;i<$x;i++))
do
	b=${a[i]}
	a[i]=${a[y]}
	a[y]=$b
	y=$((y-1))
done
echo ${a[@]}
