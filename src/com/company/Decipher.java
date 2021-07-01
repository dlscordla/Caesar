package com.company;

public class Decipher {

    public static void main(String[] args) {
        String text = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. \n" +
                "Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. \n" +
                "Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. \n" +
                "Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. \n" +
                "Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. \n" +
                "Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";
        char[] textToDecipher = text.toCharArray();
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] upperLetters = alphabet.toUpperCase().toCharArray();
        char[] lowerLetters = alphabet.toCharArray();
        for (int iteration = 0; iteration < alphabet.length(); iteration++) {
            for (int i = 0; i < textToDecipher.length; i++) {
                if (Character.isLetter(textToDecipher[i])) {
                    if (Character.isUpperCase(textToDecipher[i])) {
                        for (int j = 0; j < alphabet.length(); j++) {
                            if (textToDecipher[i] == upperLetters[j]) {
                                if ((j + 32) > alphabet.length() - 1) {
                                    textToDecipher[i] = upperLetters[j + 32 - alphabet.length()];
                                    break;
                                }
                                textToDecipher[i] = upperLetters[j + 32];
                                break;
                            }
                        }
                    } else {
                        for (int j = 0; j < alphabet.length(); j++) {
                            if (textToDecipher[i] == lowerLetters[j]) {
                                if ((j + 32) > alphabet.length() - 1) {
                                    textToDecipher[i] = lowerLetters[j + 32 - alphabet.length()];
                                    break;
                                }
                                textToDecipher[i] = lowerLetters[j + 32];
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println("Итерация " + iteration + ":\n" + new String(textToDecipher) + "\n");
        }
    }
}
