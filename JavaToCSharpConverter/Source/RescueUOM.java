package org.Rescue.rjni;
import java.lang.*;
/********************************************************************

  RescueUOM.java

  Base class for all RescueUOM classes.

  Rod Hanks,  Jun  9 2007

*********************************************************************/

public class RescueUOM
{
  public static final int NONE = 1;
  public static final int FACTOR = 2;
  public static final int FRACTION = 3;
  public static final int FORMULA = 4;


  public static native boolean IsPer(java.lang.String pos);
  public static native boolean IsIES(java.lang.String pos);
  public static native boolean CompareUOM(java.lang.String name1, java.lang.String name2);
  public static native int IndexFromName(java.lang.String name);
  public static native int UOMCount();
  public static native java.lang.String Name(int zeroBasedNdx);
  public static native boolean IsBase(int zeroBasedNdx);
  public static native java.lang.String[] QuantityTypeArray(int zeroBasedNdx);
  public static native int QuantityTypeCount(int zeroBasedNdx);
  public static native int BaseUnitIndex(int zeroBasedNdx);
  public static native int ConversionType(int zeroBasedNdx);
  public static native double ConversionFactor(int zeroBasedNdx);
  public static native double ConversionNumerator(int zeroBasedNdx);
  public static native double ConversionDenominator(int zeroBasedNdx);
  public static native double Conversion_A(int zeroBasedNdx);
  public static native double Conversion_B(int zeroBasedNdx);
  public static native double Conversion_C(int zeroBasedNdx);
  public static native double Conversion_D(int zeroBasedNdx);
}