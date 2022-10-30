const mapContainer = document.getElementById('map'),
    mapOption = {
        center: new kakao.maps.LatLng(36.5, 127.5),
        level: 13
    };

const map = new kakao.maps.Map(mapContainer, mapOption);

const marker = new kakao.maps.Marker();

kakao.maps.event.addListener(map 'click', (mouseEvent) => {
    const latlng = mouseEvent.latLng;
    marker.setPosition(latlng);
    marker.setMap(map);
    alert('위도: ${latlng.getLat()}, 경도: ${latlng.getLng()}');
});