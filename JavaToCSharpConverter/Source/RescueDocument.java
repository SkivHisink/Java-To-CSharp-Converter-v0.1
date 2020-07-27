package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueDocument.java

    Rod Hanks   June 2007

******************************************************************/
public class RescueDocument extends RescueHistoryObject
{
  public RescueDocument(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueDocument(RescueModel model)
  {
	  nativeNdx = Create_RescueDocument1(model.nativeNdx);
  }
																		  // Is added to the model automatically, but you must
                                      // subsequently archive the model.

  public boolean ImportDocument(java.lang.String pathName)
	{
	  return ImportDocument2(nativeNdx, pathName);
	}

  public void SetDocumentName(java.lang.String documentName)
	{
	  SetDocumentName3(nativeNdx, documentName);
	}

  public void ClearMetaKeywords()
	{
	  ClearMetaKeywords4(nativeNdx);
	}

  public void AddMetaKeyword(java.lang.String keywordToAdd)
	{
	  AddMetaKeyword5(nativeNdx, keywordToAdd);
	}

  public java.lang.String DocumentName()
	{
	  return DocumentName6(nativeNdx);
	}

  public java.lang.String[] MetaKeywords()
	{
	  return MetaKeywords7(nativeNdx);
	}

  public boolean ContainsMetaKey(java.lang.String keyToFind)
	{
	  return ContainsMetaKey8(nativeNdx, keyToFind);
	}

  public long DocumentLength64()
	{
	  return DocumentLength9(nativeNdx);
	}

  public int DocumentLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(DocumentLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public boolean ExportAs(java.lang.String pathName)
	{
	  return ExportAs10(nativeNdx, pathName);
	}

	private native long Create_RescueDocument1(long modelNdx);
	private native boolean ImportDocument2(long refNdx, java.lang.String pathName);
	private native void SetDocumentName3(long refNdx, java.lang.String documentName);
	private native void ClearMetaKeywords4(long refNdx);
	private native void AddMetaKeyword5(long refNdx, java.lang.String keywordToAdd);
	private native java.lang.String DocumentName6(long refNdx);
	private native java.lang.String[] MetaKeywords7(long refNdx);
	private native boolean ContainsMetaKey8(long refNdx, java.lang.String keyToFind);
	private native long DocumentLength9(long refNdx);
	private native boolean ExportAs10(long refNdx, java.lang.String pathName);
}