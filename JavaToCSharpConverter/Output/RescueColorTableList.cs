using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueColorTableList : RescueObject
{


  protected RescueColorTableList(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueColorTableList(RescueContext context,
                              long probableCount)
  {
    nativeNdx = Create_RescueColorTableList0((context == null) ? 0 : context.nativeNdx,
                                             probableCount);
  }

  public RescueColorTableList(RescueContext context,
                              int probableCount)
  {
    nativeNdx = Create_RescueColorTableList0((context == null) ? 0 : context.nativeNdx,
                                             (long) probableCount);
  }

  public void dispose()
  {
    Delete_RescueColorTableList(nativeNdx);
  }

  public RescueColorTable TableFor(string typeName)
  {
    long returnNdx = TableFor2(nativeNdx
                               ,typeName);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueColorTable myReturn = new RescueColorTable(returnNdx);
      return myReturn;
    }
  }

  public bool AddTableFor(string typeName,
                                RescueColorTable table)
  {
    bool myReturn = AddTableFor3(nativeNdx
                                      ,typeName
                                      ,(table == null) ? 0 : table.nativeNdx);
    return myReturn;
  }

  public bool DeleteTableFor(string typeName)
  {
    bool myReturn = DeleteTableFor4(nativeNdx
                                         ,typeName);
    return myReturn;
  }

  public long TypeCount64()
  {
    long myReturn = TypeCount5(nativeNdx);
    return myReturn;
  }

  public int TypeCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(TypeCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int TypeCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(TypeCount64(), throwIfTooBig);
  }

  public string[] TypeNames()
  {
    string[] myReturn = TypeNames6(nativeNdx);
    return myReturn;
  }

}

}