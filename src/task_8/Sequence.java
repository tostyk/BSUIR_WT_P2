package task_8;
public class Sequence {
    // Возвращает массив индексов. Каждый индекс соответствует элементу массива В
    // Индекс показывает, после какого элемента массива А(счет с 1) вставляется элемент массива В без учета сдвига элементов массива А (из-за вставок)
    public int[] getInsertIndexes(double[] sequenceA, double[] sequenceB) {
        int[] insertIndexes = new int[sequenceB.length];
        for (int i = 0; i < sequenceB.length; i++) {
            for (int j = 0; j < sequenceA.length; j++) {
                if (sequenceB[i] < sequenceA[0]) {
                    insertIndexes[i] = 0;
                    break;
                }
                if (sequenceB[i] > sequenceA[sequenceA.length - 1]) {
                    insertIndexes[i] = sequenceA.length;
                    break;
                }
                if(sequenceB[i] >= sequenceA[j] && sequenceB[i] < sequenceA[j + 1]) {
                    insertIndexes[i] = j + 1;
                }
            }
        }
        return insertIndexes;
    }
}
