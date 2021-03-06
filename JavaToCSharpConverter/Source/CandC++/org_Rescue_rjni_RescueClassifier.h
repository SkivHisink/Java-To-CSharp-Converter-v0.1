/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_Rescue_rjni_RescueClassifier */

#ifndef _Included_org_Rescue_rjni_RescueClassifier
#define _Included_org_Rescue_rjni_RescueClassifier
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_Rescue_rjni_RescueClassifier
 * Method:    Create_RescueClassifier0
 * Signature: ([Lorg/Rescue/rjni/RescueFlavourFactory;Z)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueClassifier_Create_1RescueClassifier0
  (JNIEnv *, jobject, jobjectArray, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueClassifier
 * Method:    Delete_RescueClassifier
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueClassifier_Delete_1RescueClassifier
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueClassifier
 * Method:    apply2
 * Signature: (JJZ)I
 */
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueClassifier_apply2
  (JNIEnv *, jobject, jlong, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueClassifier
 * Method:    IsFlavour3
 * Signature: (JJLjava/lang/String;J)Z
 */
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescueClassifier_IsFlavour3
  (JNIEnv *, jobject, jlong, jlong, jstring, jlong);

/*
 * Class:     org_Rescue_rjni_RescueClassifier
 * Method:    FlavourNamed4
 * Signature: (JLjava/lang/String;)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueClassifier_FlavourNamed4
  (JNIEnv *, jobject, jlong, jstring);

/*
 * Class:     org_Rescue_rjni_RescueClassifier
 * Method:    Flavours5
 * Signature: (J)[Lorg/Rescue/rjni/RescueFlavour;
 */
JNIEXPORT jobjectArray JNICALL Java_org_Rescue_rjni_RescueClassifier_Flavours5
  (JNIEnv *, jobject, jlong);

#ifdef __cplusplus
}
#endif
#endif
