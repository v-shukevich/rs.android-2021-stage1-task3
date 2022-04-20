package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        var result = emptyArray<String>()
        if (number.isNotEmpty() && number.all { it.isDigit() }) {
            for (i in number.indices) {
                when (number[i]){

                    '1' ->{
                        result += number.replace(number[i],'2')
                        result += number.replace(number[i],'4')
                    }
                    '2' ->{
                        result += number.replace(number[i],'1')
                        result += number.replace(number[i],'5')
                        result += number.replace(number[i],'3')
                    }
                    '3' ->{
                        result += number.replace(number[i],'2')
                        result += number.replace(number[i],'6')
                    }
                    '4' ->{
                        result += number.replace(number[i],'1')
                        result += number.replace(number[i],'5')
                        result += number.replace(number[i],'7')
                    }
                    '5' ->{
                        result += number.replace(number[i],'2')
                        result += number.replace(number[i],'4')
                        result += number.replace(number[i],'6')
                        result += number.replace(number[i],'8')
                    }
                    '6' ->{
                        result += number.replace(number[i],'3')
                        result += number.replace(number[i],'5')
                        result += number.replace(number[i],'9')
                    }
                    '7' ->{
                        result += number.replace(number[i],'4')
                        result += number.replace(number[i],'8')
                    }
                    '8' ->{
                        result += number.replace(number[i],'5')
                        result += number.replace(number[i],'7')
                        result += number.replace(number[i],'9')
                        result += number.replace(number[i],'0')
                    }
                    '9' ->{
                        result += number.replace(number[i],'6')
                        result += number.replace(number[i],'8')
                    }
                    else ->{
                        result += number.replace(number[i],'8')
                    }

                }
            }
            return result
        }

        return null
    }
}
