using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueLookupTable : RescueLookupItem
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

  public int TranslationLength(bool throwIfTooBig) //thro RuntimeException
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

  public int Rows(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Rows64(), throwIfTooBig);
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType5(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}