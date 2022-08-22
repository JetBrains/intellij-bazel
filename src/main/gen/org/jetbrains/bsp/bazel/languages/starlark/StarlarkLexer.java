/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package org.jetbrains.bsp.bazel.languages.starlark;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.jetbrains.bsp.bazel.languages.starlark.StarlarkTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Starlark.flex</tt>
 */
public class StarlarkLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\3\1\22\0\1\3\1\55\1\23\1\26\1\0\1\47\1\50\1\22\1\63\1\64\1\45"+
    "\1\16\1\57\1\17\1\13\1\46\1\5\7\10\2\4\1\60\1\56\1\53\1\44\1\54\2\0\4\12\1"+
    "\15\1\12\10\20\1\7\10\20\1\11\2\20\1\61\1\24\1\62\1\52\1\20\1\0\1\32\1\25"+
    "\1\42\1\27\1\14\1\30\2\20\1\34\1\20\1\41\1\31\1\33\1\36\1\6\1\43\1\20\1\21"+
    "\1\35\1\37\1\40\2\20\1\11\2\20\1\65\1\51\1\66\1\67\6\0\1\1\32\0\1\3\337\0"+
    "\1\3\177\0\13\3\35\0\2\1\5\0\1\3\57\0\1\3\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\2\4\1\5\1\4\1\6"+
    "\1\7\1\4\3\1\1\4\1\10\10\4\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\1"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\0\1\34\4\0\1\35\1\4\1\36"+
    "\1\37\1\4\2\0\1\4\1\0\1\40\1\0\1\40"+
    "\1\4\2\0\5\4\1\41\1\42\3\4\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\1\34\1\0\2\3\3\4"+
    "\1\40\2\0\1\4\1\0\1\61\1\0\1\61\1\62"+
    "\1\63\2\4\1\64\1\65\2\4\1\66\1\67\1\70"+
    "\1\71\1\72\1\4\2\0\1\4\1\61\2\0\1\73"+
    "\2\4\1\74\1\4\2\0\1\75\2\0\2\4\1\76"+
    "\2\0\1\77\2\4\1\100";

  private static int [] zzUnpackAction() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\u0150\0\u0188"+
    "\0\u01c0\0\u01f8\0\u0230\0\u0268\0\u02a0\0\u02d8\0\u0310\0\u0348"+
    "\0\u0380\0\u03b8\0\u03f0\0\u0428\0\u0460\0\u0498\0\u04d0\0\u0508"+
    "\0\u0540\0\u0578\0\u05b0\0\u05e8\0\u0620\0\u0658\0\u0690\0\u06c8"+
    "\0\u0700\0\u0738\0\u0770\0\70\0\70\0\70\0\70\0\70"+
    "\0\70\0\70\0\70\0\70\0\70\0\u0310\0\u0188\0\u07a8"+
    "\0\u07e0\0\u0818\0\u0850\0\u0150\0\u0888\0\70\0\70\0\u08c0"+
    "\0\u02a0\0\u02d8\0\u08f8\0\u0930\0\u0968\0\u09a0\0\u09d8\0\u0a10"+
    "\0\u0a48\0\u0a80\0\u0ab8\0\u0af0\0\u0b28\0\u0b60\0\u0b98\0\u0150"+
    "\0\u0150\0\u0bd0\0\u0c08\0\u0c40\0\70\0\70\0\70\0\70"+
    "\0\u0c78\0\70\0\70\0\70\0\70\0\70\0\u0cb0\0\70"+
    "\0\u0ce8\0\70\0\u0d20\0\u0d20\0\u0818\0\u0850\0\u0d58\0\u0d90"+
    "\0\u0dc8\0\70\0\u0e00\0\u0e38\0\u0e70\0\u0ea8\0\u0ee0\0\u0f18"+
    "\0\u0f50\0\u0150\0\u0150\0\u0f88\0\u0fc0\0\u0150\0\u0150\0\u0ff8"+
    "\0\u1030\0\70\0\70\0\70\0\u0150\0\u0150\0\u1068\0\u10a0"+
    "\0\u10d8\0\u1110\0\70\0\u1148\0\u1180\0\u0150\0\u11b8\0\u11f0"+
    "\0\u0150\0\u1228\0\u1260\0\u1298\0\u0150\0\u12d0\0\u1308\0\u1340"+
    "\0\u1378\0\u0150\0\u13b0\0\u13e8\0\u0150\0\u1420\0\u1458\0\u0150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\4\2\7"+
    "\1\10\1\11\1\7\1\12\1\13\1\7\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\7\1\26\1\7\1\27\3\7\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\71\0\3\3\20\0\1\56\47\0"+
    "\2\4\2\0\1\4\2\0\1\57\2\60\56\0\2\61"+
    "\2\62\1\61\1\63\1\0\1\57\2\60\56\0\7\7"+
    "\1\0\2\7\2\0\1\7\1\64\3\0\1\7\1\0"+
    "\15\7\30\0\7\7\1\0\2\7\2\0\2\7\3\0"+
    "\1\7\1\0\15\7\30\0\2\57\2\0\1\57\3\0"+
    "\2\60\56\0\7\7\1\0\2\7\2\0\2\7\3\0"+
    "\1\7\1\0\2\7\1\65\12\7\70\0\1\66\67\0"+
    "\1\67\27\0\7\7\1\0\1\70\1\7\2\0\2\7"+
    "\1\71\1\72\1\0\1\73\1\0\15\7\24\0\22\74"+
    "\1\75\45\74\23\76\1\77\44\76\2\0\1\3\71\0"+
    "\7\7\1\0\2\7\2\0\1\7\1\100\1\101\1\102"+
    "\1\0\1\7\1\0\15\7\24\0\1\21\2\0\65\21"+
    "\4\0\7\7\1\0\1\103\1\7\2\0\2\7\3\0"+
    "\1\7\1\0\15\7\30\0\2\7\1\104\4\7\1\0"+
    "\2\7\2\0\2\7\3\0\1\7\1\0\15\7\30\0"+
    "\2\7\1\105\4\7\1\0\2\7\2\0\2\7\3\0"+
    "\1\7\1\0\3\7\1\106\11\7\30\0\7\7\1\0"+
    "\2\7\2\0\2\7\3\0\1\7\1\0\7\7\1\107"+
    "\5\7\30\0\7\7\1\0\2\7\2\0\2\7\3\0"+
    "\1\7\1\0\1\7\1\110\5\7\1\111\5\7\30\0"+
    "\2\7\1\112\4\7\1\0\2\7\2\0\2\7\3\0"+
    "\1\7\1\0\15\7\30\0\2\7\1\113\4\7\1\0"+
    "\2\7\2\0\2\7\3\0\1\7\1\0\15\7\30\0"+
    "\7\7\1\0\2\7\2\0\2\7\3\0\1\7\1\0"+
    "\3\7\1\114\11\7\70\0\1\115\67\0\1\116\1\117"+
    "\66\0\1\120\1\0\1\121\65\0\1\122\67\0\1\123"+
    "\67\0\1\124\67\0\1\125\67\0\1\126\6\0\1\127"+
    "\60\0\1\130\7\0\1\131\57\0\1\132\27\0\2\133"+
    "\2\0\1\133\5\0\2\134\54\0\2\61\2\0\1\61"+
    "\2\0\1\57\2\60\57\0\1\135\2\0\1\135\63\0"+
    "\2\136\2\0\1\136\1\0\1\136\1\0\2\136\7\0"+
    "\1\136\1\0\2\136\1\0\1\136\7\0\1\136\31\0"+
    "\7\7\1\0\2\7\2\0\2\7\3\0\1\7\1\0"+
    "\5\7\1\137\1\140\6\7\30\0\7\7\1\0\2\7"+
    "\2\0\2\7\3\0\1\7\1\0\10\7\1\141\4\7"+
    "\30\0\7\7\1\0\2\7\2\0\2\7\1\101\1\102"+
    "\1\0\1\7\1\0\15\7\24\0\22\74\1\142\45\74"+
    "\22\0\1\143\45\0\23\76\1\142\44\76\23\0\1\144"+
    "\50\0\7\7\1\0\1\145\1\7\2\0\2\7\1\101"+
    "\1\102\1\0\1\7\1\0\15\7\24\0\22\146\1\147"+
    "\45\146\23\150\1\151\44\150\4\0\7\7\1\0\2\7"+
    "\2\0\2\7\3\0\1\7\1\0\1\7\1\152\13\7"+
    "\30\0\7\7\1\0\2\7\2\0\1\7\1\153\3\0"+
    "\1\7\1\0\15\7\30\0\7\7\1\0\2\7\2\0"+
    "\2\7\3\0\1\7\1\0\3\7\1\154\11\7\30\0"+
    "\7\7\1\0\2\7\2\0\2\7\3\0\1\7\1\0"+
    "\4\7\1\155\10\7\30\0\7\7\1\0\2\7\2\0"+
    "\2\7\3\0\1\7\1\0\1\156\14\7\30\0\7\7"+
    "\1\0\2\7\2\0\2\7\3\0\1\7\1\0\10\7"+
    "\1\157\4\7\30\0\7\7\1\0\2\7\2\0\2\7"+
    "\3\0\1\7\1\0\7\7\1\160\5\7\30\0\7\7"+
    "\1\0\2\7\2\0\2\7\3\0\1\7\1\0\6\7"+
    "\1\161\6\7\70\0\1\162\67\0\1\163\67\0\1\164"+
    "\27\0\2\133\2\0\1\133\63\0\7\7\1\0\2\7"+
    "\2\0\2\7\3\0\1\7\1\0\1\7\1\165\13\7"+
    "\30\0\7\7\1\0\1\166\1\7\2\0\2\7\3\0"+
    "\1\7\1\0\15\7\30\0\7\7\1\0\2\7\2\0"+
    "\2\7\3\0\1\7\1\0\11\7\1\167\3\7\24\0"+
    "\22\143\1\170\45\143\23\144\1\171\44\144\4\0\7\7"+
    "\1\0\2\7\2\0\2\7\3\0\1\7\1\0\3\7"+
    "\1\172\11\7\24\0\22\146\1\173\45\146\22\0\1\174"+
    "\45\0\23\150\1\173\44\150\23\0\1\175\50\0\7\7"+
    "\1\0\2\7\2\0\2\7\3\0\1\7\1\0\1\176"+
    "\14\7\30\0\7\7\1\0\2\7\2\0\2\7\3\0"+
    "\1\177\1\0\15\7\30\0\7\7\1\0\2\7\2\0"+
    "\2\7\3\0\1\7\1\0\10\7\1\200\4\7\30\0"+
    "\7\7\1\0\2\7\2\0\2\7\3\0\1\7\1\0"+
    "\6\7\1\201\6\7\30\0\7\7\1\0\2\7\2\0"+
    "\1\7\1\202\3\0\1\7\1\0\15\7\24\0\22\143"+
    "\1\203\45\143\23\144\1\204\44\144\4\0\7\7\1\0"+
    "\2\7\2\0\2\7\3\0\1\7\1\0\12\7\1\205"+
    "\2\7\24\0\22\174\1\206\45\174\23\175\1\207\44\175"+
    "\4\0\7\7\1\0\2\7\2\0\2\7\3\0\1\7"+
    "\1\0\1\210\14\7\30\0\7\7\1\0\2\7\2\0"+
    "\2\7\3\0\1\7\1\0\5\7\1\211\7\7\30\0"+
    "\7\7\1\0\2\7\2\0\2\7\3\0\1\7\1\0"+
    "\7\7\1\212\5\7\24\0\22\143\1\142\45\143\23\144"+
    "\1\142\44\144\22\174\1\213\45\174\23\175\1\214\44\175"+
    "\4\0\7\7\1\0\2\7\2\0\2\7\3\0\1\7"+
    "\1\0\3\7\1\215\11\7\30\0\7\7\1\0\2\7"+
    "\2\0\2\7\3\0\1\7\1\0\7\7\1\216\5\7"+
    "\24\0\22\174\1\173\45\174\23\175\1\173\44\175\4\0"+
    "\7\7\1\0\2\7\2\0\2\7\3\0\1\7\1\0"+
    "\11\7\1\217\3\7\30\0\7\7\1\0\1\220\1\7"+
    "\2\0\2\7\3\0\1\7\1\0\15\7\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5264];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\41\1\12\11\1\0\1\1\4\0\2\1"+
    "\2\11\1\1\2\0\1\1\1\0\1\1\1\0\2\1"+
    "\2\0\12\1\4\11\1\1\5\11\1\1\1\11\1\1"+
    "\1\11\1\1\1\0\5\1\1\11\2\0\1\1\1\0"+
    "\1\1\1\0\11\1\3\11\3\1\2\0\1\1\1\11"+
    "\2\0\5\1\2\0\1\1\2\0\3\1\2\0\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public StarlarkLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public StarlarkLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 65: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 66: break;
          case 3: 
            { return INT;
            } 
            // fall through
          case 67: break;
          case 4: 
            { return IDENTIFIER;
            } 
            // fall through
          case 68: break;
          case 5: 
            { return DOT;
            } 
            // fall through
          case 69: break;
          case 6: 
            { return PLUS;
            } 
            // fall through
          case 70: break;
          case 7: 
            { return MINUS;
            } 
            // fall through
          case 71: break;
          case 8: 
            { return COMMENT;
            } 
            // fall through
          case 72: break;
          case 9: 
            { return EQ;
            } 
            // fall through
          case 73: break;
          case 10: 
            { return ASTERISK;
            } 
            // fall through
          case 74: break;
          case 11: 
            { return DIV;
            } 
            // fall through
          case 75: break;
          case 12: 
            { return MODULO;
            } 
            // fall through
          case 76: break;
          case 13: 
            { return BIT_AND;
            } 
            // fall through
          case 77: break;
          case 14: 
            { return BIT_OR;
            } 
            // fall through
          case 78: break;
          case 15: 
            { return BIT_XOR;
            } 
            // fall through
          case 79: break;
          case 16: 
            { return LESS_THAN;
            } 
            // fall through
          case 80: break;
          case 17: 
            { return GREATER_THAN;
            } 
            // fall through
          case 81: break;
          case 18: 
            { return SEMICOLON;
            } 
            // fall through
          case 82: break;
          case 19: 
            { return COMMA;
            } 
            // fall through
          case 83: break;
          case 20: 
            { return COLON;
            } 
            // fall through
          case 84: break;
          case 21: 
            { return LEFT_BRACKET;
            } 
            // fall through
          case 85: break;
          case 22: 
            { return RIGHT_BRACKET;
            } 
            // fall through
          case 86: break;
          case 23: 
            { return LEFT_PAREN;
            } 
            // fall through
          case 87: break;
          case 24: 
            { return RIGHT_PAREN;
            } 
            // fall through
          case 88: break;
          case 25: 
            { return LEFT_CURLY;
            } 
            // fall through
          case 89: break;
          case 26: 
            { return RIGHT_CURLY;
            } 
            // fall through
          case 90: break;
          case 27: 
            { return TYLDA;
            } 
            // fall through
          case 91: break;
          case 28: 
            { return FLOAT;
            } 
            // fall through
          case 92: break;
          case 29: 
            { return OR;
            } 
            // fall through
          case 93: break;
          case 30: 
            { return PLUS_EQ;
            } 
            // fall through
          case 94: break;
          case 31: 
            { return MINUS_EQ;
            } 
            // fall through
          case 95: break;
          case 32: 
            { return STRING;
            } 
            // fall through
          case 96: break;
          case 33: 
            { return IF;
            } 
            // fall through
          case 97: break;
          case 34: 
            { return IN;
            } 
            // fall through
          case 98: break;
          case 35: 
            { return IS_EQUAL;
            } 
            // fall through
          case 99: break;
          case 36: 
            { return ASTERISK_EQ;
            } 
            // fall through
          case 100: break;
          case 37: 
            { return DOUBLE_ASTERISK;
            } 
            // fall through
          case 101: break;
          case 38: 
            { return DIV_EQ;
            } 
            // fall through
          case 102: break;
          case 39: 
            { return DIV_INT;
            } 
            // fall through
          case 103: break;
          case 40: 
            { return MODULO_EQ;
            } 
            // fall through
          case 104: break;
          case 41: 
            { return AND_EQ;
            } 
            // fall through
          case 105: break;
          case 42: 
            { return OR_EQ;
            } 
            // fall through
          case 106: break;
          case 43: 
            { return XOR_EQ;
            } 
            // fall through
          case 107: break;
          case 44: 
            { return LESS_OR_EQUAL;
            } 
            // fall through
          case 108: break;
          case 45: 
            { return BIT_SHIFT_LEFT;
            } 
            // fall through
          case 109: break;
          case 46: 
            { return GREATER_OR_EQUAL;
            } 
            // fall through
          case 110: break;
          case 47: 
            { return BIT_SHIFT_RIGHT;
            } 
            // fall through
          case 111: break;
          case 48: 
            { return IS_NOT_EQUAL;
            } 
            // fall through
          case 112: break;
          case 49: 
            { return BYTES;
            } 
            // fall through
          case 113: break;
          case 50: 
            { return DEF;
            } 
            // fall through
          case 114: break;
          case 51: 
            { return FOR;
            } 
            // fall through
          case 115: break;
          case 52: 
            { return AND;
            } 
            // fall through
          case 116: break;
          case 53: 
            { return NOT;
            } 
            // fall through
          case 117: break;
          case 54: 
            { return DIV_INT_EQ;
            } 
            // fall through
          case 118: break;
          case 55: 
            { return SHIFT_LEFT_EQ;
            } 
            // fall through
          case 119: break;
          case 56: 
            { return SHIFT_RIGHT_EQ;
            } 
            // fall through
          case 120: break;
          case 57: 
            { return ELIF;
            } 
            // fall through
          case 121: break;
          case 58: 
            { return ELSE;
            } 
            // fall through
          case 122: break;
          case 59: 
            { return LOAD;
            } 
            // fall through
          case 123: break;
          case 60: 
            { return PASS;
            } 
            // fall through
          case 124: break;
          case 61: 
            { return BREAK;
            } 
            // fall through
          case 125: break;
          case 62: 
            { return RETURN;
            } 
            // fall through
          case 126: break;
          case 63: 
            { return LAMBDA;
            } 
            // fall through
          case 127: break;
          case 64: 
            { return CONTINUE;
            } 
            // fall through
          case 128: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
