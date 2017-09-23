package pe.push_notification.alumno.push_notification;

/**
 * Created by alumno on 22/09/2017.
 */
import android.app.PendingIntent;
import android.media.RingtoneManager;
import android.util.Log;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyFirebaseMessagingService  extends FirebaseMessagingService{
    private static final String TAG = "MyFirebaseMsgService";
    @Override
    public void OnMessageReceived(RemoteMessage remoteMessage){
        Log.d(TAG,"FROM: " + remoteMessage.getFrom());

        if(remoteMessage.getData().size()>0) {
            Log.d(TAG, "Message data" + remoteMessage.getData());
        }
        if(remoteMessage.getNotification()!=null) {
            Log.d(TAG, "Message body" + remoteMessage.getNotification().getBody());
            //sendNotification();
        }
    }

    private void sendNotification(String body){
        Intent intent = new Intent(this,MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,intent, PendingIntent.FLAG_ONE_SHOT);

        //Uri notificationSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

    }


}
