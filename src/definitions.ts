export interface NfcCheckerPlugin {
  isNfcAvailable(): Promise<{ supported: boolean; enabled: boolean }>;
}
