package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueDataContainer.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueDataContainer extends RescueHistoryObject
{


  protected RescueDataContainer(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueDataContainer(RescueModel model,
                             RescueGrid customGrid)
  {
    nativeNdx = Create_RescueDataContainer0((model == null) ? 0 : model.nativeNdx,
                                            (customGrid == null) ? 0 : customGrid.nativeNdx);
  }

  public cNameValuePair NamedData()
  {
    long returnNdx = NamedData1(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cNameValuePair myReturn = new cNameValuePair(returnNdx);
      return myReturn;
    }
  }

  public RescueGrid PropertyGrid()
  {
    long returnNdx = PropertyGrid2(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGrid myReturn = new RescueGrid(returnNdx);
      return myReturn;
    }
  }

  public cSetRescueProperty Properties()
  {
    long returnNdx = Properties3(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescueProperty myReturn = new cSetRescueProperty(returnNdx);
      return myReturn;
    }
  }

  public cSetRescuePropertyGroup PropertyGroups()
  {
    long returnNdx = PropertyGroups4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescuePropertyGroup myReturn = new cSetRescuePropertyGroup(returnNdx);
      return myReturn;
    }
  }

  public RescueProperty NthRescueProperty(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueProperty5(nativeNdx
                                        ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueProperty NthRescueProperty(int zeroBasedOrdinal)
  {
    long returnNdx = NthRescueProperty5(nativeNdx
                                        ,(long) zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueProperty PropertyIdentifiedBy(long identifier)
  {
    long returnNdx = PropertyIdentifiedBy6(nativeNdx
                                           ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueProperty PropertyIdentifiedBy(int identifier)
  {
    long returnNdx = PropertyIdentifiedBy6(nativeNdx
                                           ,(long) identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueProperty PropertyNamed(java.lang.String name)
  {
    long returnNdx = PropertyNamed7(nativeNdx
                                    ,name);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueGrid Grid()
  {
    long returnNdx = Grid8(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGrid myReturn = new RescueGrid(returnNdx);
      return myReturn;
    }
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel9(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModel myReturn = new RescueModel(returnNdx);
      return myReturn;
    }
  }

  public void dispose()
  {
    Delete_RescueDataContainer(nativeNdx);
  }

  private native long Create_RescueDataContainer0(long model,
                                                 long customGrid);
  private native long NamedData1(long refNdx);
  private native long PropertyGrid2(long refNdx);
  private native long Properties3(long refNdx);
  private native long PropertyGroups4(long refNdx);
  private native long NthRescueProperty5(long refNdx
                                         ,long zeroBasedOrdinal);
  private native long PropertyIdentifiedBy6(long refNdx
                                            ,long identifier);
  private native long PropertyNamed7(long refNdx
                                     ,java.lang.String name);
  private native long Grid8(long refNdx);
  private native long ParentModel9(long refNdx);
  private native void Delete_RescueDataContainer(long ndx);
}
