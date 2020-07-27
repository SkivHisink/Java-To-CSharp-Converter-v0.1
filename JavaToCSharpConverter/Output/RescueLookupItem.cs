using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueLookupItem : RescueObject
{


  protected RescueLookupItem(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueLookupItem()
  {
  }

  public void dispose()
  {
    Delete_RescueLookupItem(nativeNdx);
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType2(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}