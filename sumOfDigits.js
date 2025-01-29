// A function that calculates the sum of digits entered by the user. (If they enter 123, 6 is printed.)

function Main(){
    // user input
    let userimp = prompt("Give me some numbers.: ");
    
    // cast th string to a list
    let array = userimp.split("");
    
    // final output
    let sumOfNum = 0;
    
    // for loop that iterats through the length of the array then adds the out puts.
    for (let i = 0; i < array.length; i++){
        let output = parseInt(array[i])
        sumOfNum += output
    }
    console.log('The some of your numbers is...', sumOfNum)
}
Main()

