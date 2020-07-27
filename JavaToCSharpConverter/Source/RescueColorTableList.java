package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueColorTableList.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueColorTableList extends RescueObject
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

  public RescueColorTable TableFor(java.lang.String typeName)
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

  public boolean AddTableFor(java.lang.String typeName,
                                RescueColorTable table)
  {
    boolean myReturn = AddTableFor3(nativeNdx
                                      ,typeName
                                      ,(table == null) ? 0 : table.nativeNdx);
    return myReturn;
  }

  public boolean DeleteTableFor(java.lang.String typeName)
  {
    boolean myReturn = DeleteTableFor4(nativeNdx
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

  public int TypeCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(TypeCount64(), throwIfTooBig);
  }

  public java.lang.String[] TypeNames()
  {
    java.lang.String[] myReturn = TypeNames6(nativeNdx);
    return myReturn;
  }

  private native long Create_RescueColorTableList0(long context,
                                                  long probableCount);
  private native void Delete_RescueColorTableList(long ndx);
  private native long TableFor2(long refNdx
                                ,java.lang.String typeName);
  private native boolean AddTableFor3(long refNdx
                                     ,java.lang.String typeName
                                     ,long table);
  private native boolean DeleteTableFor4(long refNdx
                                        ,java.lang.String typeName);
  private native long TypeCount5(long refNdx);
  private native java.lang.String[] TypeNames6(long refNdx);
}
