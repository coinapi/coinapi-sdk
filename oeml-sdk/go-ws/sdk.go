package api

import (
	"go-ws/types"
	v1 "go-ws/v1"
)

func NewOemlSDK(url string, version types.Version) (sdk types.SDK) {
	sdk = getSDK(version, url)
	return sdk
}

func getSDK(version types.Version, url string) (sdk types.SDK) {
	switch version {
	case types.V1:
		// Bind interface to implementation matching the selected API version.
		sdk = v1.NewOemlSdkV1(url)
	default:
		sdk = v1.NewOemlSdkV1(url)
	}
	return sdk
}
