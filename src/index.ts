import { registerPlugin } from '@capacitor/core';

import type { NfcCheckerPlugin } from './definitions';

const NfcChecker = registerPlugin<NfcCheckerPlugin>('NfcChecker', {
  web: () => import('./web').then(m => new m.NfcCheckerWeb()),
});

export * from './definitions';
export { NfcChecker };
