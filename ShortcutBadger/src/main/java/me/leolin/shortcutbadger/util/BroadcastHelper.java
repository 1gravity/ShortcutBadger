package me.leolin.shortcutbadger.util;

import android.content.Context;
import android.content.Intent;

/**
 * Created by mahijazi on 17/05/16.
 */
public class BroadcastHelper {
	public static boolean canResolveBroadcast(Context context, Intent intent) {
		// On Samsung devices with 4.4.x the query returns an empty list but the Intent is still
		// received and processed. Maybe Samsung doesn't allow to query/resolve its internal
		// BroadcastReceivers...
		/*PackageManager packageManager = context.getPackageManager();
		List<ResolveInfo> receivers = packageManager.queryBroadcastReceivers(intent, 0);
		return receivers != null && receivers.size() > 0;*/
		return true;
	}
}
