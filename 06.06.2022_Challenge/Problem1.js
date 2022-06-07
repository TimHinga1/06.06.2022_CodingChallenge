let N = parseInt(gets());
for (let i = 0; i < N; i++) {
    let input = gets().split(" ");
    input.sort();
    console.log(input[input.length - 2]);
}