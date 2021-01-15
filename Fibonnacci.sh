echo "Enter a number : $1"

# First Number of the
# Fibonacci Series
a=0
n=$1
# Second Number of the
# Fibonacci Series
b=1
 
echo "The Fibonacci series is : "
 
for (( i=0; i<n; i++ ))
do
 
    echo -n "$a "
    fn=$((a + b))
    a=$b
    b=$fn
 
done
