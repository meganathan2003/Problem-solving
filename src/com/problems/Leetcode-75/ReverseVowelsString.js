/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function (s) {
    // Convert string to array to allow swapping characters
    let arr = s.split('');
    console.log('split', arr);

    let vowels = new Set(['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']);
    let i = 0, j = arr.length - 1;

    while (i < j) {

        while (i < j && !vowels.has(arr[i])) {
            i++;
        }

        while (i < j && !vowels.has(arr[j])) {
            j--;
        }

        [arr[i], arr[j]] = [arr[j], arr[i]];
        i++;
        j--;

    }
    console.log(arr);

    return arr.join('');
};


console.log(reverseVowels("IceCreAm"));
console.log(reverseVowels("leetcode")); 
