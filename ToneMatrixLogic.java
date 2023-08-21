public class ToneMatrixLogic {
    /** Given the contents of the tone matrix, returns a string of notes that should be played to represent that matrix.
     * @param toneMatrix The contents of the tone matrix.
     * @param column The column number that is currently being played.
     * @param samples The sound samples associated with each row.
     * @return A sound sample corresponding to all notes currently being played. */
    public static double[] matrixToMusic(boolean[][] toneMatrix, int column, double[][] samples) {
        double[] result = new double[ToneMatrixConstants.sampleSize()];

        for (int i = 0; i < toneMatrix.length; i++) {
            if (toneMatrix[i][column]) {
                double[] sample = samples[i];

                for (int j = 0; j < sample.length; j++) {
                    result[j] += sample[j];
                }
            }
        }

        double maxAmplitude = 0.0;

        for (double value : result) {
            maxAmplitude = Math.max(maxAmplitude, Math.abs(value));
        }

        if (maxAmplitude > 1.0) {
            for (int i = 0; i < result.length; i++) {
                result[i] /= maxAmplitude;
            }
        }

        return result;
    }
}