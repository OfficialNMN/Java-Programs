console.log ('Armstrong Numbers:');
for (let i = 1; i <= 500; i++) {
    let numberOfDigits = i.toString().length;
    let sum = 0;
    let temp = i;
        while (temp > 0) {
        let remainder = temp % 10;
        sum += remainder ** numberOfDigits;   
        temp = parseInt(temp / 10); 
    }
    if (sum == i) {
        console.log(i);
    }
}
