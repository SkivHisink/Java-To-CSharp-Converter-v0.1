package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueLookupTable.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueLookupTable extends RescueLookupItem
{


  protected RescueLookupTable(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueLookupTable(RescueContext context,
                           long rowsIn,
                           float[] tableIn)
  {
    nativeNdx = Create_RescueLookupTable0((context == null) ? 0 : context.nativeNdx,
                                          rowsIn,
                                          tableIn);
  }

  public void dispose()
  {
    Delete_RescueLookupTable(nativeNdx);
  }

  public float[] Translation()
  {
    float[] myReturn = Translation2(nativeNdx);
    return myReturn;
  }

  public long TranslationLength64()
  {
    long myReturn = TranslationLength3(nativeNdx);
    return myReturn;
  }

  public int TranslationLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(TranslationLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int TranslationLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(TranslationLength64(), throwIfTooBig);
  }

  public long Rows64()
  {
    long myReturn = Rows4(nativeNdx);
    return myReturn;
  }

  public int Rows()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Rows64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int Rows(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(Rows64(), throwIfTooBig);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType5(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueLookupTable0(long context,
                                               long rowsIn,
                                               float[] tableIn);
  private native void Delete_RescueLookupTable(long ndx);
  private native float[] Translation2(long refNdx);
  private native long TranslationLength3(long refNdx);
  private native long Rows4(long refNdx);
  private native boolean IsOfType5(long refNdx
                                  ,int thisType);
}
