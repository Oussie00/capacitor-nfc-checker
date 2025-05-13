import { WebPlugin } from '@capacitor/core';
import type { NfcCheckerPlugin } from './definitions';

export class NfcCheckerWeb extends WebPlugin implements NfcCheckerPlugin {
  isNfcAvailable(): Promise<{ supported: boolean; enabled: boolean; }> {
    console.error("This plugin is only available for android");
    throw new Error('Method not implemented.');
  }
}
