/** This class contains methods that produce useful constants for implementing the Tone Matrix. */
public class ToneMatrixConstants {
    /** Returns the size of one side of the tone matrix.
     * @return The size of one side of the tone matrix.
     * @usage ToneMatrixConstants.size() */
    public static int size() {
        return 16;
    }

    /** Returns the length, in samples, of the array that should be used for each note.  Decreasing this
     * value will make the notes play faster, while increasing it will make the notes play more slowly.
     * By default, this function returns a sample that's one-eighth of a second long. */
    public static int sampleSize() {
        return StdAudio.SAMPLE_RATE / 8;
    }
}