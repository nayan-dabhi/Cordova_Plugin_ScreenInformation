/* globals cordova, module */

module.exports = {
  getInformation: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, 'ScreenInformation', 'get_information', []);
  }
};
