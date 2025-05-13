package be.bytescape.plugins.nfcchecker;

import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.content.Context;

import com.getcapacitor.Plugin;
import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.PluginMethod;

import org.json.JSONObject;

@CapacitorPlugin(name = "NfcChecker")
public class NfcCheckerPlugin extends Plugin {

    @PluginMethod
    public void isNfcAvailable(PluginCall call) {
        NfcManager manager = (NfcManager) getContext().getSystemService(Context.NFC_SERVICE);
        NfcAdapter adapter = manager != null ? manager.getDefaultAdapter() : null;

        boolean supported = adapter != null;
        boolean enabled = supported && adapter.isEnabled();

        JSObject result = new JSObject();
        result.put("supported", supported);
        result.put("enabled", enabled);

        call.resolve(result);
    }
}
