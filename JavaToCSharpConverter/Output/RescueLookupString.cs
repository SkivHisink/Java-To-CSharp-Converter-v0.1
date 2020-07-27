using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueLookupString : RescueLookupItem
{


  protected RescueLookupString(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueLookupString(nativeNdx);
  }

  public RescueLookupString(RescueContext context,
                            string translationString)
  {
    nativeNdx = Create_RescueLookupString1((context == null) ? 0 : context.nativeNdx,
                                           translationString);
  }

  public string Translation()
  {
    string myReturn = Translation2(nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType3(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}