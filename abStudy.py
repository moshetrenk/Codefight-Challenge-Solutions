def AlphabetStudy(letter, word):
    for i in word:
        if i not in letter:
            return "No"
        
    return "Yes"
