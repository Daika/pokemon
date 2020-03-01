import { PokAppPage } from './app.po';

describe('pok-app App', () => {
  let page: PokAppPage;

  beforeEach(() => {
    page = new PokAppPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
