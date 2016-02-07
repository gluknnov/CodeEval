#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

bool hasLetters(int letterCounts[], int letters_in_english) {
    for (int i = 0; i < letters_in_english; i++) {
        if(letterCounts[i] > 0) {
            return true;
        }
    }

    return false;
}

string solve(string &input) {
    int beauty = 0;
    int beautyValue = 26;
    const int letters_in_english = 26;
    int letter_counts[letters_in_english] = {0};

    for(int i = 0; i < input.length(); i++) {
        char c = input[i];
        if((c >= 'A') && (c <= 'Z')) { 
            c -= 'A' - 'a'; 
        } 
        if((c >= 'a') && (c <= 'z')) { 
            letter_counts[c - 'a']++; 
        }
    }

    while (hasLetters(letter_counts, letters_in_english)) {
        int maxNum = 0;
        for(int i = 0; i < letters_in_english; i++) {
            if(letter_counts[maxNum] < letter_counts[i]) {
                maxNum = i;
            }
        }

        beauty += letter_counts[maxNum] * beautyValue;
        letter_counts[maxNum] = 0;
        beautyValue--;
    }

    return to_string(beauty);
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
