// Copyright (c) 2021. Marvin Friedrich Lars Hansen. All Rights Reserved. Contact: marvin.hansen@gmail.com

package v1

import (
	"go-ws/types"
	"log"
)

const verbose = false

func (s SDKImpl) PlaceSingleOrder(req *types.OrderNewSingleRequest) (err error) {
	b, err := req.MarshalJSON()
	logError(err)
	logError(err)
	err = s.sendMessage(b)
	return checkError(err)
}

func (s SDKImpl) CancelSingleOrder(req *types.OrderCancelSingleRequest) (err error) {
	b, err := req.MarshalJSON()
	logError(err)
	err = s.sendMessage(b)
	return checkError(err)
}

func (s SDKImpl) CancelAllOrders(req *types.OrderCancelAllRequest) (err error) {
	b, err := req.MarshalJSON()
	logError(err)
	err = s.sendMessage(b)
	return checkError(err)
}

func (s SDKImpl) sendMessage(b []byte) (err error) {
	if verbose {
		println("Write message into Web Socket: ")
		println(string(b))
	}
	err = ws.WriteByteMessage(b)
	if err != nil {
		log.Println("can't send message!")
		logError(err)
		return err
	}
	return nil
}
